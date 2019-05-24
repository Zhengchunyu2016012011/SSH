package cn.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 刘畅
 * @version 2019/5/24
 */
@Entity
@Table(name = "t_category")
public class Category {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "status")
    private  String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
