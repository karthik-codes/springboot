package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Products {
	
        int id;
		String name;
		Long price;
		public Products(int id, String name, Long price) {
			this.id=id;
			this.name=name;
			this.price=price;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Long getPrice() {
			return price;
		}
		public void setPrice(Long price) {
			this.price = price;
		}
	
		public static void main(String[] args) {

	List<Products> products=new ArrayList<>();
	products.add(new Products(10,"Mac",1000L));
	products.add(new Products(10,"android",1500L));
	products.add(new Products(10,"ubuntu",2000L));
	products.add(new Products(10,"windows",3000L));
	products.add(new Products(10,"windiws11",4000L));
	products.add(new Products(10,"explorer",5000L));
	
//products.stream().filter(x->x.getPrice()>1500).forEach(y->System.out.println(y.getPrice()));
	
products.stream().filter(f->f.getName().startsWith("w")).map(v->v.getName().replace("w","K"))
.forEach(z->System.out.println(z));
	}
		

}
