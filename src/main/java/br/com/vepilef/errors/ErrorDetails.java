package br.com.vepilef.errors;

public class ErrorDetails {
	private String title;
	private int status;
	private String detail;
	private String timestamo;
	private String developerMessage;
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getTimestamo() {
		return timestamo;
	}

	public void setTimestamo(String timestamo) {
		this.timestamo = timestamo;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}
	
	
	
	public static final class Builder {
		private String title;
		private int status;
		private String detail;
		private String timestamo;
		private String developerMessage;

		private Builder() {
		}

		public static Builder newBuilder() {
			return new Builder();
		}

		public Builder title(String title) {
			this.title = title;
			return this;
		}

		public Builder status(int status) {
			this.status = status;
			return this;
		}

		public Builder detail(String detail) {
			this.detail = detail;
			return this;
		}

		public Builder timestamo(String timestamo) {
			this.timestamo = timestamo;
			return this;
		}

		public Builder developerMessage(String developerMessage) {
			this.developerMessage = developerMessage;
			return this;
		}

		public ErrorDetails build() {
			ErrorDetails ErrorDetails = new ErrorDetails();
			ErrorDetails.setTitle( title);
			ErrorDetails.setDetail(detail);
			ErrorDetails.setDeveloperMessage(developerMessage);
			ErrorDetails.setTimestamo(timestamo);
			ErrorDetails.setStatus(status);
			return ErrorDetails;
		}
	}
	
	
	
	

}
