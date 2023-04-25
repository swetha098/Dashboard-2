package com.UST.Dashboard.Repository;

import com.UST.Dashboard.model.Dashboard;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DashboardRepo extends JpaRepository<Dashboard,Integer> {
}
