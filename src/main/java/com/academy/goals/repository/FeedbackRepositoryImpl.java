package com.academy.goals.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Feedback;

@Service
public class FeedbackRepositoryImpl implements FeedbackRepository {
	// storing data temporary…
	List<Feedback> list;

	// adding constructor of List<Feedback>
	public FeedbackRepositoryImpl() {
		// adding data into this constructor.
		list = new ArrayList<>();
		list.add(new Feedback(1, "Feedbacks",
				"Food was not good"));
		list.add(new Feedback(2, "Feedback",
				"Its good"));
	}

	@Override
	public List<Feedback> addFeedbacks() {
		// TODO Auto-generated method stub
		return list;
	}
}