package demo.repository;

import java.util.List;

import demo.entities.Company;

public interface CompanyDAO {
		public List<Company> getAllCompanies();
		public Company getCompnayById(Integer id);
		public String addCompany(Company company);

}