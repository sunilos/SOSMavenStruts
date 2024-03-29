package in.co.sunrays.struts.model;

import in.co.sunrays.struts.dto.CollegeDTO;
import in.co.sunrays.struts.exception.ApplicationException;
import in.co.sunrays.struts.exception.DatabaseException;
import in.co.sunrays.struts.exception.DuplicateRecordException;

import java.util.List;

/**
 * Data Access Object of College
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public interface CollegeModelInt {

	/**
	 * Add a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 * @throws DuplicateRecordException
	 *             : throws when college already exists
	 */
	public long add(CollegeDTO dto) throws ApplicationException,
			DuplicateRecordException;

	/**
	 * Update a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 * @throws DuplicateRecordException
	 *             : if updated user record is already exist
	 */
	public void update(CollegeDTO dto) throws ApplicationException,
			DuplicateRecordException;

	/**
	 * Delete a College
	 * 
	 * @param dto
	 * @throws ApplicationException
	 */
	public void delete(CollegeDTO dto) throws ApplicationException;

	/**
	 * Find College by Name
	 * 
	 * @param name
	 *            : get parameter
	 * @return dto
	 * @throws ApplicationException
	 */
	public CollegeDTO findByName(String name) throws ApplicationException;

	/**
	 * Find College by PK
	 * 
	 * @param pk
	 *            : get parameter
	 * @return dto
	 * @throws ApplicationException
	 */
	public CollegeDTO findByPK(long pk) throws ApplicationException;

	/**
	 * Search College with pagination
	 * 
	 * @return list : List of College
	 * @param dto
	 *            : Search Parameters
	 * @param pageNo
	 *            : Current Page No.
	 * @param pageSize
	 *            : Size of Page
	 * @throws ApplicationException
	 */
	public List search(CollegeDTO dto, int pageNo, int pageSize)
			throws ApplicationException;

	/**
	 * Search College
	 * 
	 * @return list : List of College
	 * @param dto
	 *            : Search Parameters
	 * @throws ApplicationException
	 */
	public List search(CollegeDTO dto) throws ApplicationException;

}
