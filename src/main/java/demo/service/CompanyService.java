package demo.service;

import java.util.List;

import demo.entities.Company;

public interface CompanyService {
	public List<Company> getAllCompanies();
	public Company getCompnayById(Integer id);
	public String addCompany(Company company);
}