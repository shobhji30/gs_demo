package Component.Autowired.example.AnnotaionDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationDemo {



	public static void main(String[] args) {


		ApplicationContext applicationContext =
				SpringApplication.run(AnnotationDemo.class, args);

		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearch);
		System.out.println(binarySearch1);

		int result =
				binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}
}
