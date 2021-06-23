package org.hch.security.board.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table
public class Board {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private Long idx;
	
	@Column
	@NotBlank(message = "게시글 제목을 입력해주세요")
	private String title;
	
	@Column
	@NotBlank(message = "내용을 입력해주세요")
	private String content;
	
	@Column
	private LocalDateTime regdate;
	
	@Column
	private LocalDateTime updateDate;

	@Builder
	public Board(Long idx, String title, String content, LocalDateTime regdate, LocalDateTime updateDate) {
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.updateDate = updateDate;
	}
}