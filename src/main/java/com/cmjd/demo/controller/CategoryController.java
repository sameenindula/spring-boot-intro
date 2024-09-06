// package com.cmjd.demo.controller;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.cmjd.demo.entity.Category;
// import com.cmjd.demo.service.CategoryServies;


// @RestController
// public class CategoryController {
//     @Autowired

//     private CategoryServies categoryServies;

//     @GetMapping("/category")
//     public ResponseEntity <List<Category>>getAllList(){
//         List<Category> categoryList=categoryServies.getCategory();
//         return ResponseEntity.status(200).body(categoryList);
//     }
//     @PostMapping("/category")
//     public ResponseEntity <String> createCategory(@RequestBody Category catagory) {
        
//         if (catagory.getName()==null || catagory.getName()=="") {
//             return ResponseEntity.status(422).body("please enter valid task name");
            
//         }
//         categoryServies.save(catagory);
//         return ResponseEntity.status(201).body("Task Add Sucessfull");
//     }
    
    
//     @GetMapping("/category/{categoryId}")    //add a  path variable
//     public ResponseEntity<Category>  getCategoryId(@PathVariable Long categoryId) {
//         Category category = categoryServies.getCategoryById(categoryId);

//         if (category == null){
//             return ResponseEntity.status(404).body(null);
//         }else{
//             return ResponseEntity.status(200).body(category);
//         }
//     }
//     @PutMapping("/category/{categoryId}")
//     public ResponseEntity<Category> updateCategory(@PathVariable Long categoryId, @RequestBody Category category) {
//         Category updateCategory=categoryServies.updateCategory(categoryId, category);
//         if (updateCategory == null){
//             return ResponseEntity.status(404).body(null);
//         }else{
//             return ResponseEntity.status(200).body(updateCategory);
//         }
//     }

//     @DeleteMapping("category/{categoryId}")
//         public void deleteTask(@PathVariable Long categoryId){
//         categoryServies.delteCategory(categoryId);

    
//     }


// }
