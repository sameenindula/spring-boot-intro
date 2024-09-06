// package com.cmjd.demo.service;

// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;

// import com.cmjd.demo.entity.Category;
// import com.cmjd.demo.repository.CategoryReppsitory;

// public class CategoryImpl implements CategoryServies {
//     @Autowired

//     private final CategoryReppsitory categoryReppsitory;
//     public CategoryImpl(CategoryReppsitory categoryReppsitory){
//         this.categoryReppsitory=categoryReppsitory;
//     }
//     @Override
//     public Category save(Category catagory) {
//         return categoryReppsitory.save(catagory);
//     }
//     @Override
//     public List<Category> getCategory() {
//         return categoryReppsitory.findAll();
//     }
//     @Override
//     public Category getCategoryById(Long Id) {
//         return categoryReppsitory.findById(Id).orElse(null);
//     }

//     @Override
//     public void delteCategory(Long Id) {
//         categoryReppsitory.deleteById(Id);
// }
//     @Override
//     public Category updateCategory(Long Id, Category category) {
//         Category exsistingCategory = categoryReppsitory.findById(Id).orElse(category);

//         if (exsistingCategory==null) {
//             return null;
//         }else{
//             exsistingCategory.setName(category.getName());
//             exsistingCategory.setCreatedTime(category.getCreatedTime());
//             return categoryReppsitory.save(exsistingCategory);
//         }
//         }
// }