

        Arrays.sort(s, 0, n, Collections.reverseOrder(new Comparator<String>() {
            public int compare(String s1, String s2) {
                BigDecimal b1 = new BigDecimal(s1);
                BigDecimal b2 = new BigDecimal(s2);
                return b1.compareTo(b2);

            }
        }));

