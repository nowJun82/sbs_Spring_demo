package com.ljj.exam.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ljj.exam.demo.service.ArticleService;
import com.ljj.exam.demo.vo.Article;

@Controller
public class UserArticleController {
	@Autowired
	private ArticleService articleService;

	// doAdd
	@RequestMapping("/user/article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id = articleService.writeArticle(title, body);
		
		Article article = articleService.getArticle(id);
		return article;
	}

	// getArticles
	@RequestMapping("/user/article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articleService.getArticles();
	}

	// getArticle
	@RequestMapping("/user/article/getArticle")
	@ResponseBody
	public Object getArticleAction(int id) {
		Article article = articleService.getArticle(id);

		if (article == null) {
			return id + "번 게시물이 존재하지 않습니다.";
		}
		return article;
	}

	// doModify
	@RequestMapping("/user/article/doModify")
	@ResponseBody
	public String doModify(int id, String title, String body) {
		Article article = articleService.getArticle(id);

		if (article == null) {
			return id + "번 게시물이 존재하지 않습니다.";
		}
		articleService.modifyArticle(id, title, body);

		return id + "번 게시물이 수정되었습니다.";
	}

	// doDelete
	@RequestMapping("/user/article/doDelete")
	@ResponseBody
	public String doDelete(int id) {
		Article article = articleService.getArticle(id);

		if (article == null) {
			return id + "번 게시물이 존재하지 않습니다.";
		}
		articleService.deleteArticle(id);

		return id + "번 게시물이 삭제되었습니다.";
	}
}