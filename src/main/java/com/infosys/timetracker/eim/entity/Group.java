package com.infosys.timetracker.eim.entity;

import lombok.Data;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@RestResource(rel="group", path="group")
public class Group implements Serializable {

    @Id
    private String groupId;
    private String groupName;
    private int maintId;
    private Timestamp maintTs;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "group")
    private List<Employee> employees;


}
