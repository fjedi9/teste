package br.com.vepilef.errors;

import java.time.LocalDate;

public class ResourceNotFoundDetails extends ErrorDetails{
	

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

		public ResourceNotFoundDetails build() {
			ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
			resourceNotFoundDetails.setTitle( title);
			resourceNotFoundDetails.setDetail(detail);
			resourceNotFoundDetails.setDeveloperMessage(developerMessage);
			resourceNotFoundDetails.setTimestamo(timestamo);
			resourceNotFoundDetails.setStatus(status);
			return resourceNotFoundDetails;
		}
	}
}
