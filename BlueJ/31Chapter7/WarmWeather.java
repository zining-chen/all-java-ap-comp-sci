boolean warm = (location.isTropics()) || 
               ( (time.getMonth()==4 || time.getMonth()==10) && weather.isSunny() ) || 
               (location.isNorthernHemisphere() && time.getMonth()>=5 && time.getMonth() <= 9) || 
               (location.isSouthernHemisphere() && (time.getMonth()>= 11 ||time.getMonth()<= 3) );
