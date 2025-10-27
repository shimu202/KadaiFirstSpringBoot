package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

	@GetMapping("/dayofweek/{yyyymmdd}")
	public String dispDayOfweek(@PathVariable("yyyymmdd") String str1) {
		

		String sub1 = str1.substring(0, 4);
		String sub2 = str1.substring(4, 6);
		String sub3 = str1.substring(6);

		Calendar cal = Calendar.getInstance();

		cal.set(Integer.parseInt(sub1), Integer.parseInt(sub2) - 1, Integer.parseInt(sub3));

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		String result ="0";

		if (dayOfWeek == 1) {
			result="Sunday";
		} else if (dayOfWeek == 2) {
			result ="Monday";
		} else if (dayOfWeek == 3) {
			result ="Tuesday";
		} else if (dayOfWeek == 4) {
			result ="Wednesday";
		} else if (dayOfWeek == 5) {
			result ="Thursday";
		} else if (dayOfWeek == 6) {
			result ="Friday";
		} else if (dayOfWeek == 7) {
			result ="saturday";
		}

		return result;

	}

	@GetMapping("/plus/{val1}/{val2}")
	public String calcPlus(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		int res = 0;
		res = val1 + val2;
		return "実行結果" + res;

	}

	@GetMapping("/minus/{val1}/{val2}")
	public String calcMinus(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		int res = 0;
		res = val1 - val2;
		return "実行結果" + res;
	}

	@GetMapping("/times/{val1}/{val2}")
	public String clacTimes(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		int res = 0;
		res = val1 * val2;
		return "実行結果" + res;
	}

	@GetMapping("/divide/{val1}/{val2}")
	public String ClacDivide(@PathVariable("val1") int val1, @PathVariable("val2") int val2) {
		int res = 0;
		res = val1 / val2;
		return "実行結果" + res;
	}

}
