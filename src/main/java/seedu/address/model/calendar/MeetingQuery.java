package seedu.address.model.calendar;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MeetingQuery {
    private final ObservableList<Meeting> meetingList = FXCollections.observableArrayList();
    private final ObservableList<Meeting> meetingUnmodifiableList =
            FXCollections.unmodifiableObservableList(meetingList);
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Duration duration;

    public MeetingQuery(List<Meeting> meetingList, LocalDateTime startDate,
                        LocalDateTime endDate, Duration duration) {
        requireAllNonNull(meetingList, startDate, endDate, duration);
        this.meetingList.addAll(meetingList);
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
    }

    public ObservableList<Meeting> getMeetingList() {
        return meetingList;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Duration getDuration() {
        return duration;
    }
}