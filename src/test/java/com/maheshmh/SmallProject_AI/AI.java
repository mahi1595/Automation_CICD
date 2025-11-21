package com.maheshmh.SmallProject_AI;

public class AI {

    public static void main(String[] args) {
        // Initialize from args so the value can vary at runtime (avoids compile-time NPE warning)
        String s1 = (args.length > 0) ? args[0] : null;
        if (s1 != null) {
            String trimmed = s1.trim();
            System.out.println(trimmed);
        } else {
            System.out.println("s1 is null - skipping trim to avoid NullPointerException.");
        }
    }
}
