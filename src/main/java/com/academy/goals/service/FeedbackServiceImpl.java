package com.academy.goals.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.academy.goals.model.Feedback;
import com.academy.goals.repository.FeedbackRepository;
import com.academy.goals.repository.FeedbackRepositoryImpl;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	// storing data temporary…
	List<Feedback> list;

	@Override
	public List<Feedback> getFeedbacks() {
		FeedbackRepository feedbackRepository = new FeedbackRepositoryImpl();
		this.list = feedbackRepository.addFeedbacks();
		return list;
	}
}