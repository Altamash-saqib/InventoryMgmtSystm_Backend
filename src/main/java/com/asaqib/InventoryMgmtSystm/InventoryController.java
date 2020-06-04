package com.asaqib.InventoryMgmtSystm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.asaqib.InventoryMgmtSystm.model.Items;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class InventoryController {	

	
	@Autowired
	InventoryRepository repo;
	
	@RequestMapping("/")
	public String home() {
		return "Application Running Successfully...";
	}

	@PostMapping("/addItems")
	public Items addItems(@RequestBody Items items) {
		
		/*logger.info(" Books Added Successfully...");*/
		return repo.save(items);

	}
	
	@GetMapping("/getItems")
	@ResponseBody
	public List<Items> getItems() {
		return (List<Items>)repo.findAll();
	}
	
	
	@DeleteMapping(value = "/deleteItems/{s_no}")
	public Map<String, Boolean> deleteItem(@PathVariable("s_no") int s_no)throws Exception{
	Items item =
        repo
            .findById(s_no)
            .orElseThrow(() -> new ItemNotFoundException("Book not found on :: " + s_no));
    repo.delete(item);
    Map<String, Boolean> response = new HashMap<>();
    response.put("deleted", Boolean.TRUE);
    return response;
  }
	
	@GetMapping("/items/{id}")
    public ResponseEntity<Items> getItemNo(@PathVariable(value = "id") int s_no)
      throws ItemNotFoundException {
        Items item = repo.findById(s_no)
           .orElseThrow(() -> new ItemNotFoundException("Book not found for this id :: " + s_no));
        return ResponseEntity.ok().body(item);
    }

	 @PutMapping("/updateItems/{id}")
	    public ResponseEntity<Items> updateItem(@PathVariable(value = "id") int s_no,
	      @Valid @RequestBody Items itemDetails) throws ItemNotFoundException {
		 
	        Items item= repo.findById(s_no)
	           .orElseThrow(() -> new ItemNotFoundException("Book not found for this id :: " + s_no));
	        
	        item.setName(itemDetails.getName());
	        item.setCategory(itemDetails.getCategory());
	        item.setCost_price(itemDetails.getCost_price());
	        item.setSelling_price(itemDetails.getSelling_price());
	        item.setQuantity(itemDetails.getQuantity());
	        final Items updatedItem = repo.save(item);
	        return ResponseEntity.ok(updatedItem);
	    }
}