public class CallRating {
    private String callId;
    private int callDuration;
    private double callQuality;
    private String ratingCategory;

    public CallRating(String callId, int callDuration, double callQuality) {
        this.callId = callId;
        this.callDuration = callDuration;
        this.callQuality = callQuality;
        this.ratingCategory = calculateRatingCategory();
    }

    private String calculateRatingCategory() {
        double ratingScore = callQuality / callDuration;

        if (ratingScore >= 0.08) {
            return "Excellent";
        } 
        else if (ratingScore >= 0.05) {
            return "Good";
        } 
        else {
            return "Average";
        }
    }

    public String getCallId() {
        return callId;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public double getCallQuality() {
        return callQuality;
    }

    public String getRatingCategory() {
        return ratingCategory;
    }
}