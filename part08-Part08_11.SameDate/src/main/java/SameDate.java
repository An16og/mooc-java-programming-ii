public boolean equals(Object object) {
        // if the variables are located in the same place
        if (this == object) {
            return true;
        }

        // if the object is not of Type SimpleDate
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate comparedObject = (SimpleDate) object;
        if (this.day == comparedObject.day && this.month == comparedObject.month && this.year == comparedObject.year) {
            return true;
        }

        return false;
    }
}