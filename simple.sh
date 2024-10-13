#!/bin/bash

#By Ali and ChatGPT-4o-mini

wallpaper_dir="$(ls ~/wallpaper)"

# Show the menu using Rofi
chosen=$(echo -e "$wallpaper_dir" | rofi -dmenu -i -p "Choose a wallpaper:3 ")
path="~/wallpaper/$chosen"

if [[ -z "$chosen" ]]; then
	notify-send "you didn't pick any wallpaper"
	return 1
else
	exec waypaper --wallpaper $path &
fi
