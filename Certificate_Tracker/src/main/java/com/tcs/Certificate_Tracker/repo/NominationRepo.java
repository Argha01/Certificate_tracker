package com.tcs.Certificate_Tracker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.tcs.Certificate_Tracker.NominationDetails;

public interface NominationRepo extends JpaRepository<NominationDetails,Integer>{

	@Query(value="select * from Nomination_Details c where c.employee_id=?1 AND c.certification_id =?2 AND c.quarter_no=?3",nativeQuery = true)
	NominationDetails findBycertification_idAndemployee_idAndquarter_no(Integer emp_id, Integer cert_id,Integer quarter_no);
}
