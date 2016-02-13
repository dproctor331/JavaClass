from django.contrib import admin

# Register your models here.
from .forms import SignUpForm
from .models import SignUp

class SignUpAdmin(admin.ModelAdmin):
	list_display = ["full_name", "__str__", "timestamp", "updated"]
	form = SignUpForm

admin.site.register(SignUp, SignUpAdmin)