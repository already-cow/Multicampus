package org.galapagos.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.galapagos.domain.SampleDTO;
import org.galapagos.domain.SampleDTOList;
import org.galapagos.domain.TodoDTO;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {
	// /sample/ 자체가 되었을 때 호출
	@RequestMapping("")
	public void basic() {
		log.info("basic............");
	}

	// Spring v4 까지 사용
	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basicGet() {
		log.info("basic get............");
		// return "sample/basic" ---> 현재 url이 return
	}

	// Spring v5 부터 각 method 방식에 따라 어노테이션 추가
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get............");
	}

	// return 타입이 다름
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}

	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name: " + name);
		log.info("age: " + age);
		return "ex02";
	}

	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") String[] ids) {
		log.info("ids: " + ids);
		return "ex02List";
	}

	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("list dtos: " + list);
		return "ex02Bean";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo: " + todo);
		return "ex03";
	}

	@GetMapping("/ex04")
	public String ex04(@ModelAttribute("sample") SampleDTO dto, @ModelAttribute("page") int page, Model model) {
		log.info("dto: " + dto);
		log.info("page: " + page);

		model.addAttribute("now", new Date());

		return "ex04";
	}

	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		log.info("/ex06........");

		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");

		return dto;
	}

	@GetMapping("/ex07")
	public ResponseEntity<String> ex07() {
		log.info("/ex07.............");

		String msg = "{\"name\": \"홍길동\"}";

		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");

		return new ResponseEntity<>(msg, header, HttpStatus.OK); // 200 응답
	}

	@GetMapping("/exUpload")
	public void exUpload() {
		log.info("/exUpload..........");
	}

	@PostMapping("/exUploadPost")
	public void exUploadPost(ArrayList<MultipartFile> files) {
		for (MultipartFile file : files) {
			if (file.isEmpty()) // 파일 없어도 허용
				continue;

			log.info("---------------------------------");
			log.info("name:" + file.getOriginalFilename());
			log.info("size:" + file.getSize());

			// 저장
			File dest = new File("c:/upload", file.getOriginalFilename());
			try {
				file.transferTo(dest);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@GetMapping("/ex10")
	public void ex10() {
		throw new RuntimeException("예외 실험");
	}

}