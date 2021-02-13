package br.com.vepilef.errors;

import java.time.LocalDate;

public class ValidationErrorDetails extends ErrorDetails {
	private String field;
	private String fieldMessage;

	public String getField() {
		return field;
	}

	public String getFieldMessage() {
		return fieldMessage;
	}

	
	public static final class Builder {
		private String title;
		private int status;
		private String detail;
		private String timestamo;
		private String developerMessage;
		private String field;
		private String fieldMessage;

		private Builder() {
		}

		public static Builder newBuilder() {
			return new Builder();
		}
		
		public Builder field(String field) {
			this.field = field;
			return this;
		}
		
		public Builder fieldMessage(String fieldMessage) {
			this.fieldMessage = fieldMessage;
			return this;
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

		public ValidationErrorDetails build() {
			ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
			validationErrorDetails.setTitle( title) ;
			validationErrorDetails.setDetail( detail);
			validationErrorDetails.setDeveloperMessage ( developerMessage);
			validationErrorDetails.setTimestamo ( timestamo);
			validationErrorDetails.setStatus (status);
			validationErrorDetails.field = field;
			validationErrorDetails.fieldMessage = fieldMessage;
			
			return validationErrorDetails;
		}
	}
	
}
