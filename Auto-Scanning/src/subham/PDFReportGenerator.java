package subham;

import org.springframework.stereotype.Component;

@Component(value="pdf")
public class PDFReportGenerator implements ReportGenerator {

	@Override
	public String generateReport(int recordsPerPage) {
		// TODO Auto-generated method stub
		return "PDF Report generated with "+recordsPerPage+" pages";
	}

}
