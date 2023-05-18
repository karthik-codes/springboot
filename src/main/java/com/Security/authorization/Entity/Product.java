package com.Security.authorization.Entity;


	

	public class Product {

		private String pName;
		private int pId;
		private float price;
		
		public Product() {}

		public Product(String pName, int pId, float price) {
			super();
			this.pName = pName;
			this.pId = pId;
			this.price = price;
		}

		public String getpName() {
			return pName;
		}

		public void setpName(String pName) {
			this.pName = pName;
		}

		public int getpId() {
			return pId;
		}

		public void setpId(int pId) {
			this.pId = pId;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Product [pName=" + pName + ", pId=" + pId + ", price=" + price + "]";
		}
		
		
		
	}


