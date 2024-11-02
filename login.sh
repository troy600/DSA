#!/usr/bin/bash

login=$(echo "Exit|Shutdown|Restart|Suspend|Terminal" | rofi -dmenu -no-X -sep "|"  -p "Want to shudown? or Restart?" -window-title "Power Menu")


dmenu() {
    echo "$1" | rofi -p "Are you sure about that?" -dmenu -no-X -window-title "shutdown" -sep "|"
}

shutdown_prompt() {
    dmenu "$(echo "Yes|No")"
}

Shutdown() {
    opts=$(shutdown_prompt)
    case "$opts" in 
        "Yes")
            echo "shutdown now"
            ;;
        "No")
            rofi -e "cancelled"
            return 1
            ;;
        esac
}


case "$login" in
    "Exit")
        echo "Exiting"  
        ;;
    "Shutdown")
        Shutdown
        ;;
    "Restart")
        echo "Restarting"
        ;;
    *)
        echo "does nothing"
        ;;
esac