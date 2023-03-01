package com.admin.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "career")
public class Career {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String country;
		private String city;
		private String jobtitle;
		private String jobtype;
		private String date;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getJobtitle() {
			return jobtitle;
		}
		public void setJobtitle(String jobtitle) {
			this.jobtitle = jobtitle;
		}
		public String getJobtype() {
			return jobtype;
		}
		public void setJobtype(String jobtype) {
			this.jobtype = jobtype;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public Career() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Career(int id, String country, String city, String jobtitle, String jobtype, String date) {
			super();
			this.id = id;
			this.country = country;
			this.city = city;
			this.jobtitle = jobtitle;
			this.jobtype = jobtype;
			this.date = date;
		}
		
}
