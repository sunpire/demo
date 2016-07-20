package sunpire.com.springbootdemo.product.imp;

import org.springframework.stereotype.Component;

import sunpire.com.springbootdemo.product.IProduct;

@Component("productA")
public class ProductA implements IProduct
{

	public String getModelNo() {
		// TODO Auto-generated method stub
		return "Model A";
	}

}
