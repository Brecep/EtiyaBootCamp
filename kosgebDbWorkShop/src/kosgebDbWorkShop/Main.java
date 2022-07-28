package kosgebDbWorkShop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.Applicant;
import entities.Application;
import entities.BlackList;
import entities.Credit;
import entities.CreditFeature;
import entities.Entrepreneur;
import entities.Feature;
import entities.User;

public class Main {

	public static void main(String[] args) {
		// User user = new Applicant();

		Applicant applicant = new Entrepreneur(1, "recep.kullanici.06", "12345", 2, 1, "Recep", "Bayindir");
		// User user = applicant;

		Credit credit = new Credit(1, "Erzurum Kredisi", LocalDate.parse("2022-02-02"), null);
		Feature feature = new Feature(1, "Girişimci Desteği", "65.000");
		CreditFeature creditFeature = new CreditFeature(1, credit, feature);
		credit.setCreditFeature(creditFeature);

		List<Applicant> applicants = new ArrayList<>();
		applicants.add(applicant);

		Application application = new Application(1, applicants, credit);
		BlackList blackList = new BlackList(1, applicants);

		System.out.println(blackList.getApplicants().get(0).getUserName());
		System.out.println(application.getApplicants().get(0).getApplicantId());
		System.out.println(credit.getCreditFeature().getFeature().getName());
		System.out.println(applicant.getApplicantId());
	}

}
