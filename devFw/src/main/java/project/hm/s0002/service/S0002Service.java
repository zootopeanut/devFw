package project.hm.s0002.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import project.hm.s0002.vo.S0002VO;

public interface S0002Service {
	 public List<S0002VO> searchList(Map<String, Object> searchMap) throws DataAccessException;

	public void saveData(Map<String, String[]> dataMap)  throws DataAccessException ;
}
