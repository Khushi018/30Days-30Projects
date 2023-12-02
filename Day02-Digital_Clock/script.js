function updateClock() {
     let now = new Date()
     let dname = now.getDay(),
      month = now.getMonth(), 
      date = now.getDate(), 
     year = now.getFullYear(),
      hour = now.getHours(), 
      min = now.getMinutes(), 
      seconds = now.getSeconds(),
      pe = "AM";


      if(hour == 0) hour = 12;

      if(hour > 12) {
        hour -= 12
      pe = "PM"
      }

      Number.prototype.pad = function(dig) {

      }

      const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

      const weeks = ["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"];

      const ids = ["day", "month", "date", "year", "hour", "minutes", "seconds", "period"]

      const vals = [weeks[dname] , months[month], date, year, hour, min, seconds, pe];

      for(let i=0; i<ids.length; i++) 
      document.getElementById(ids[i]).firstChild.nodeValue = vals[i];    

}

function initClock() {
    updateClock();
    window.setInterval("updateClock()", 1); 
}

initClock();