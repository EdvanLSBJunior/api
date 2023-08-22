package med.voll.api;

import com.uber.h3core.H3Core;
import com.uber.h3core.util.LatLng;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class ApiApplication {

	public ApiApplication() {
	}

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ApiApplication.class, args);

		H3Core h3 = H3Core.newInstance();

		double lat = -12.955383;
		double lng = -38.453283;
		int res = 9;

		String hexAddr = h3.latLngToCellAddress(lat, lng, res);

		List<LatLng> LatLngs = h3.cellToBoundary(hexAddr);

		System.out.println(LatLngs);

	}

}
