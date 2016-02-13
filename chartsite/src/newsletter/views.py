from django.conf import settings
from django.core.mail import send_mail
from django.shortcuts import render
from .forms import ContactForm, SignUpForm

# Create your views here.
def home(request):
	title = 'Welcome'
	form = SignUpForm(request.POST or None)

	context = {
		'title': title,
		'form': form
	}

	if form.is_valid():
		instance - form.save(commit=False)
		context = {
			'title': 'Thank you'
		}

	return render(request, "base.html", context)

def contact(request):
	form = ContactForm(request.POST or None)
	
	if form.is_valid():
		email = form.cleaned_data.get('email')
		message = form.cleaned_data.get('message')
		full_name = form.cleaned_data.get('full_name')
		subject = 'Site contact form'
		contact_message = 'This is the contact message'
		from_email = settings.EMAIL_HOST_USER
		#to_email = [from_email, yourotheremail@email.com]
		send_mail(subject, 
			contact_message, 
			from_email, 
			to_email, 
			fail_silently=False)
	
	context = {
		'form': form,
	}

	return render(request, "forms.html", context)