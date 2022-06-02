package demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.entities.Company;
import demo.repository.CompanyDAO;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyDAO companyDAO;
	
	@Override
	public List<Company> getAllCompanies() {
		return companyDAO.getAllCompanies();
	}

	@Override
	public Company getCompnayById(Integer id) {
		return companyDAO.getCompnayById(id);
	}

	@Override
	public String addCompany(Company company) {
		return companyDAO.addCompany(company);
	}

}