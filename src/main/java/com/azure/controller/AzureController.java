package com.azure.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.model.AzureModel;

@RestController
@RequestMapping("/azure")
public class AzureController {

	@GetMapping ResponseEntity<List<AzureModel>> getSimulation() {
		AzureModel azureModel1 = new AzureModel("Jose", "Peixoto", "Baturite");
		AzureModel azureMode21 = new AzureModel("Ana", "Silvia", "Florianopolis");
		AzureModel azureMode31 = new AzureModel("Joaquim", "Rodrigues", "Recife");
		AzureModel azureMode41 = new AzureModel("João", "Barbosa", "Fortaleza");
		
		List<AzureModel> azureModelList = new ArrayList<AzureModel>();
		
		azureModelList.add(azureModel1);
		azureModelList.add(azureMode21);
		azureModelList.add(azureMode31);
		azureModelList.add(azureMode41);
		
		return ResponseEntity.status(HttpStatus.OK).body(azureModelList);
	}

}
