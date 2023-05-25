package com.example.FacadePattern;

public class ShopKeeper {

	
		private MobileShop iphone;
		private MobileShop realMe;
		
		  public ShopKeeper(){  
		        iphone= new Iphone();  
		        realMe=new Realme();  
		         
		    }
		  
		  public void iphoneSale(){  
		        iphone.modelNo();  
		        iphone.price();  
		    }  
		        public void samsungSale(){  
		        realMe.modelNo();  
		    } 
		        
		        public static void main(String args[]) {
		        	ShopKeeper sk=new ShopKeeper();
		        	sk.iphoneSale();
		        	}

	

}
