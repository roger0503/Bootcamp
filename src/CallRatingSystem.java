public class CallRatingSystem {
    public static CallRating[] rateCalls(int[] callDurations, double[] callQualities) {
        CallRating[] callRatings = new CallRating[callDurations.length];
        for (int i = 0; i < callDurations.length; i++) {
            String callId = "C" + (i + 1); 
            callRatings[i] = new CallRating(callId, callDurations[i], callQualities[i]);
        }

        return callRatings;
    }

    public static void main(String[] args) {
        int[] callDurations = {12, 45, 56};
        double[] callQualities = {0.67, 0.34, 0.76};

        CallRating[] callRatings = rateCalls(callDurations, callQualities);
        for (CallRating rating : callRatings) {
            System.out.println("Call ID: " + rating.getCallId());
            System.out.println("Call Duration: " + rating.getCallDuration() + " minutes");
            System.out.println("Call Quality: " + rating.getCallQuality());
            System.out.println("Rating Category: " + rating.getRatingCategory());
            System.out.println();
        }
    }
}