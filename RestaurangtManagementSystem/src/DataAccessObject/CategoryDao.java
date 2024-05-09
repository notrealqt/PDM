package DataAccessObject;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Category;


public class CategoryDao {
    public static void save(Category category) {
        String query = "insert into category (name) values ('"+category.getName()+"')";
        DbOperation.setDataOrDelete(query, "Category Added Successfully");
    
    }

    public static ArrayList<Category> getAllRecords () {
        ArrayList<Category> arrayList = new ArrayList<> ();
        try {
            ResultSet rs = DbOperation.getData("select * from category");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void delete(String id) {
        String query = "delete from category where id = '"+id+"' ";
        DbOperation.setDataOrDelete(query, "Category Deleted Successfully");
    }
    
    public static Category getCategoryByname (String name){
        Category category = new Category();
        try{
            ResultSet rs = DbOperation.getData("select id from category where name = '"+name+"'");
            while (rs.next()){
                category.setId(rs.getInt(1));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return category;
    }
}
