package subham;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="service")
public class ReportService {

	@Autowired
	@Qualifier("pdf")
	private ReportGenerator report;
	
	@Value("100")
	private int recordsPerPage;

	public ReportService() {
		System.out.println("Default Constructor");
	}

	public ReportService(int recordsPerPage) {
		System.out.println("Constructor");
		this.recordsPerPage = recordsPerPage;
	}

	public ReportGenerator getReport() {
		return report;
	}

	public void setReport(ReportGenerator report) {
		this.report = report;
	}

	public int getRecordsPerPage() {
		return recordsPerPage;
	}

	public void setRecordsPerPage(int recordsPerPage) {
		this.recordsPerPage = recordsPerPage;
	}
	
	public void generateReport(){
		System.out.println(report.generateReport(recordsPerPage));
	}
	
}
