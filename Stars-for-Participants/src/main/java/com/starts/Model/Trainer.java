package com.starts.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Trainer {
	private Trainee trainee;
	List<String> skillSet = new ArrayList<>();

	public Trainee getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee trainee) {
		this.trainee = trainee;
	}

	public List<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "Trainer [trainee=" + trainee + ", skillSet=" + skillSet + "]";
	}

}
