#!/usr/bin/bash

login=$(echo "Exit|Shutdown|Restart|Suspend|Terminal" | rofi -dmenu -no-X -sep "|"  -p "Want to shudown? or Restart?" -window-title "Power Menu")

dmenu() {
    echo "$1" | rofi -p "Are you sure about that?" -dmenu -no-X -window-title "login" -sep "|"
}

shutdown_prompt() {
    dmenu 'Yes|No'
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

restart() {
    opts=$(dmenu 'Yes|No')
    case "$opts" in
        "Yes")
            echo "Restart now"
            ;;
        "No")
            rofi -e "canceled"
            return 1
            ;;
    esac

}



case "$login" in
    "Exit")
        echo "Exiting"  
        exit
        ;;
    "Shutdown")
        Shutdown
        ;;
    "Restart")
        restart
        ;;
    "Terminal")
        rofi-sensible-terminal
        ;;
    "Suspend")
        systemctl suspend
        ;;
esac