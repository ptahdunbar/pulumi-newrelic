// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertMutingRuleSchedule {
    /**
     * @return The datetime stamp when the muting rule schedule stops repeating. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-10T15:00:00&#39;. Conflicts with `repeat_count`
     * 
     */
    private @Nullable String endRepeat;
    /**
     * @return The datetime stamp that represents when the muting rule ends. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-15T14:30:00&#39;
     * 
     */
    private @Nullable String endTime;
    /**
     * @return The frequency the muting rule schedule repeats. If it does not repeat, omit this field. Options are DAILY, WEEKLY, MONTHLY
     * 
     */
    private @Nullable String repeat;
    /**
     * @return The number of times the muting rule schedule repeats. This includes the original schedule. For example, a repeatCount of 2 will recur one time. Conflicts with `end_repeat`
     * 
     */
    private @Nullable Integer repeatCount;
    /**
     * @return The datetime stamp that represents when the muting rule starts. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-08T14:30:00&#39;
     * 
     */
    private @Nullable String startTime;
    private String timeZone;
    /**
     * @return The day(s) of the week that a muting rule should repeat when the repeat field is set to &#39;WEEKLY&#39;. Example: [&#39;MONDAY&#39;, &#39;WEDNESDAY&#39;]
     * 
     */
    private @Nullable List<String> weeklyRepeatDays;

    private AlertMutingRuleSchedule() {}
    /**
     * @return The datetime stamp when the muting rule schedule stops repeating. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-10T15:00:00&#39;. Conflicts with `repeat_count`
     * 
     */
    public Optional<String> endRepeat() {
        return Optional.ofNullable(this.endRepeat);
    }
    /**
     * @return The datetime stamp that represents when the muting rule ends. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-15T14:30:00&#39;
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return The frequency the muting rule schedule repeats. If it does not repeat, omit this field. Options are DAILY, WEEKLY, MONTHLY
     * 
     */
    public Optional<String> repeat() {
        return Optional.ofNullable(this.repeat);
    }
    /**
     * @return The number of times the muting rule schedule repeats. This includes the original schedule. For example, a repeatCount of 2 will recur one time. Conflicts with `end_repeat`
     * 
     */
    public Optional<Integer> repeatCount() {
        return Optional.ofNullable(this.repeatCount);
    }
    /**
     * @return The datetime stamp that represents when the muting rule starts. This is in local ISO 8601 format without an offset. Example: &#39;2020-07-08T14:30:00&#39;
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    public String timeZone() {
        return this.timeZone;
    }
    /**
     * @return The day(s) of the week that a muting rule should repeat when the repeat field is set to &#39;WEEKLY&#39;. Example: [&#39;MONDAY&#39;, &#39;WEDNESDAY&#39;]
     * 
     */
    public List<String> weeklyRepeatDays() {
        return this.weeklyRepeatDays == null ? List.of() : this.weeklyRepeatDays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertMutingRuleSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endRepeat;
        private @Nullable String endTime;
        private @Nullable String repeat;
        private @Nullable Integer repeatCount;
        private @Nullable String startTime;
        private String timeZone;
        private @Nullable List<String> weeklyRepeatDays;
        public Builder() {}
        public Builder(AlertMutingRuleSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endRepeat = defaults.endRepeat;
    	      this.endTime = defaults.endTime;
    	      this.repeat = defaults.repeat;
    	      this.repeatCount = defaults.repeatCount;
    	      this.startTime = defaults.startTime;
    	      this.timeZone = defaults.timeZone;
    	      this.weeklyRepeatDays = defaults.weeklyRepeatDays;
        }

        @CustomType.Setter
        public Builder endRepeat(@Nullable String endRepeat) {
            this.endRepeat = endRepeat;
            return this;
        }
        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder repeat(@Nullable String repeat) {
            this.repeat = repeat;
            return this;
        }
        @CustomType.Setter
        public Builder repeatCount(@Nullable Integer repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        @CustomType.Setter
        public Builder weeklyRepeatDays(@Nullable List<String> weeklyRepeatDays) {
            this.weeklyRepeatDays = weeklyRepeatDays;
            return this;
        }
        public Builder weeklyRepeatDays(String... weeklyRepeatDays) {
            return weeklyRepeatDays(List.of(weeklyRepeatDays));
        }
        public AlertMutingRuleSchedule build() {
            final var o = new AlertMutingRuleSchedule();
            o.endRepeat = endRepeat;
            o.endTime = endTime;
            o.repeat = repeat;
            o.repeatCount = repeatCount;
            o.startTime = startTime;
            o.timeZone = timeZone;
            o.weeklyRepeatDays = weeklyRepeatDays;
            return o;
        }
    }
}
