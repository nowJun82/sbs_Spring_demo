package com.ljj.exam.demo.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ljj.exam.demo.vo.Article;

@Mapper
public interface ArticleRepository {

	public Article writeArticle(String title, String body);
	
	public List<Article> getArticles();

	// SELECT * FROM article WHERE id = ?
	@Select("SELECT * FROM article WHERE id = #{id}")
	public Article getArticle(int id);

	public void modifyArticle(int id, String title, String body);

	public void deleteArticle(int id);
}