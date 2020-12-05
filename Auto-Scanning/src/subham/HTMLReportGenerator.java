package subham;

import org.springframework.stereotype.Component;

@Component(value="html")
public class HTMLReportGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		
		return "HTML Report generated with "+recordsPerPage+" pages";
	}

}
