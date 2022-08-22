package trainingManagementSystem.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Comments")
public class Comment extends BaseEntity {
	private Integer reportId;
	private String content;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;

	public Comment() {
		super();
	}

	public Comment(Integer reportId, String content) {
		super();
		this.reportId = reportId;
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public Integer getReportId() {
		return reportId;
	}

	public User getUser() {
		return user;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
