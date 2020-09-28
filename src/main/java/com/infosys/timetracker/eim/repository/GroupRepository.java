package com.infosys.timetracker.eim.repository;

import com.infosys.timetracker.eim.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, String> {
}
