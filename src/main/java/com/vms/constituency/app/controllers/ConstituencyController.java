package com.vms.constituency.app.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vms.constituency.app.constantmessage.ConstantMessages;
import com.vms.constituency.app.entity.Constituency;
import com.vms.constituency.app.exceptionstatus.SuccessInfo;
import com.vms.constituency.app.service.IConstituencyService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@Api("This is the controller to perform CRUD operation on Constituency entity")
@RequestMapping("/constituency")
@RestController()
public class ConstituencyController {

	@Autowired
	IConstituencyService iConstituencyService;

	@ApiOperation("This is to add Constituency to the database")
	@PostMapping("/addConstituency")
	public ResponseEntity<SuccessInfo> processPost(@RequestBody Constituency constituency) {
		iConstituencyService.addConstituency(constituency);
		SuccessInfo successinfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.INSERTMSG, constituency.getConstituencyId());
		return new ResponseEntity<>(successinfo, HttpStatus.CREATED);
	}

	@ApiOperation("This is to view Constituency id from database")
	@GetMapping("/constituencyId={constituencyId}")
	public Constituency getConstituencyById(@PathVariable("constituencyId") int constituencyId) {
		return iConstituencyService.getConstituencyById(constituencyId);
	}

	@ApiOperation("This is to view all Constituencies present in database")
	@GetMapping("/viewConstituencies")
	public List<Constituency> processGet() {
		return iConstituencyService.getAllConstituency();
	}

	@ApiOperation("This is to update the Constituency present in database")
	@PutMapping("/updateConstituency")
	public ResponseEntity<SuccessInfo> processPut(@RequestBody Constituency constituency) {
		iConstituencyService.updateConstituency(constituency);
		SuccessInfo successinfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.UPDATEMSG, constituency.getConstituencyId());
		return new ResponseEntity<>(successinfo, HttpStatus.CREATED);
	}

	@ApiOperation("This is to delete the Constituency by id from database")
	@DeleteMapping("/deleteConstituency={constituencyId}")
	public ResponseEntity<SuccessInfo> deleteConstituencyById(@PathVariable("constituencyId") int constituencyId) {
		iConstituencyService.deleteConstituencyById(constituencyId);
		SuccessInfo successInfo = new SuccessInfo(HttpStatus.CREATED.value(), HttpStatus.CREATED,
				ConstantMessages.DELETEMSG, constituencyId);
		return new ResponseEntity<>(successInfo, HttpStatus.CREATED);
	}
}
