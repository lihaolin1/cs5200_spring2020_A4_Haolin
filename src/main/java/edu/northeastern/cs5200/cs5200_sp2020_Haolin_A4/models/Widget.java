package edu.northeastern.cs5200.cs5200_sp2020_Haolin_A4.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table
public class Widget {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int widget_id;
	private String type;
	private int width;
	private int height;
	//image
	private String src;
	//headingwidget
	private int size;
	//paragraph
	private String text;
	//list
	private String[] items;
	private Boolean ordered;
	//youtube
	private String youTubeId;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public Boolean getOrdered() {
		return ordered;
	}
	public void setOrdered(Boolean ordered) {
		this.ordered = ordered;
	}
	public String getYouTubeId() {
		return youTubeId;
	}
	public void setYouTubeId(String youTubeId) {
		this.youTubeId = youTubeId;
	}
	
	@ManyToOne()
	@JsonIgnore
	private Topic topic_widget_g;
	
	public Widget() {
		
	}
}
